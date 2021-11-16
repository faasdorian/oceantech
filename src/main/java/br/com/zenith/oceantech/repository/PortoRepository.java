package br.com.zenith.oceantech.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.zenith.oceantech.domain.Porto;

import java.util.List;

@Repository
public interface PortoRepository extends CrudRepository<Porto, Integer> {

    public Porto findAllById(Integer id);
}
