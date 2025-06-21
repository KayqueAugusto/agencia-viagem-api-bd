package com.agencia.viagem.service;

import com.agencia.viagem.model.Destino;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DestinoService {
    private Map<Long, Destino> destinos = new HashMap<>();
    private long contadorId = 1;

    public Destino cadastrar(Destino destino) {
        destino.setId(contadorId++);
        destinos.put(destino.getId(), destino);
        return destino;
    }

    public List<Destino> listarTodos() {
        return new ArrayList<>(destinos.values());
    }

    public List<Destino> pesquisar(String nomeOuLocal) {
        return destinos.values().stream()
            .filter(d -> d.getNome().toLowerCase().contains(nomeOuLocal.toLowerCase()) ||
                         d.getLocalizacao().toLowerCase().contains(nomeOuLocal.toLowerCase()))
            .toList();
    }

    public Destino buscarPorId(Long id) {
        return destinos.get(id);
    }

    public boolean excluir(Long id) {
        return destinos.remove(id) != null;
    }

    public Destino avaliar(Long id, int nota) {
        Destino destino = destinos.get(id);
        if (destino != null) {
            int total = destino.getTotalAvaliacoes();
            double novaMedia = ((destino.getMediaAvaliacao() * total) + nota) / (total + 1);
            destino.setMediaAvaliacao(novaMedia);
            destino.setTotalAvaliacoes(total + 1);
        }
        return destino;
    }
}
