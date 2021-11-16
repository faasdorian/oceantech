package br.com.zenith.oceantech.service;

import br.com.zenith.oceantech.domain.Porto;
import br.com.zenith.oceantech.repository.PortoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortoService {

    private PortoRepository portoRepository;

    public PortoService(PortoRepository portoRepository) {
        this.portoRepository = portoRepository;
    }

    public List<Porto> getAllPortos () {
        return (List<Porto>) portoRepository.findAll();
    }

    public void addPorto(Porto porto) {
        portoRepository.save(porto);
    }

}
