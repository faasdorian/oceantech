package br.com.zenith.oceantech.service;

import br.com.zenith.oceantech.domain.Porto;
import br.com.zenith.oceantech.repository.PortoRepository;
import org.springframework.stereotype.Service;

@Service
public class PortoService {

    private PortoRepository portoRepository;

    public PortoService(PortoRepository portoRepository) {
        this.portoRepository = portoRepository;
    }
}
