package vermelho_brasa.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vermelho_brasa.model.CamaradaServidorModel;
import vermelho_brasa.repository.ICamaradaServidorRepository;


@Service
@RequiredArgsConstructor
public class CamaradaServidorService implements ICamaradaServidorService {

    private final ICamaradaServidorRepository icamaradaServidorRepository;

    @Override
    public CamaradaServidorModel save(CamaradaServidorModel camaradaServidorModel) {
        return icamaradaServidorRepository.save(camaradaServidorModel);
    }

    @Override
    public CamaradaServidorModel update(CamaradaServidorModel camaradaServidorModel) {
        return save(camaradaServidorModel);
    }
    
}
