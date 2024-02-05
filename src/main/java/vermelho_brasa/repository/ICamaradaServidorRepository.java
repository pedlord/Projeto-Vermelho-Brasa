package vermelho_brasa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vermelho_brasa.model.CamaradaServidorModel;

public interface ICamaradaServidorRepository extends JpaRepository<CamaradaServidorModel, Integer> {
    
}
