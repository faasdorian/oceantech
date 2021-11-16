package br.com.zenith.oceantech.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.zenith.oceantech.domain.Porto;

@Repository
public interface PortoRepository extends CrudRepository<Porto, Integer> {
}
