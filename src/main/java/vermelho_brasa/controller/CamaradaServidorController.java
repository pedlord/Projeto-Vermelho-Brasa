package vermelho_brasa.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vermelho_brasa.model.CamaradaServidorModel;
import vermelho_brasa.service.ICamaradaServidor;



@RestController
@RequestMapping(value = "/camaradaServidor")
@RequiredArgsConstructor
public class CamaradaServidorController {

    private final ICamaradaServidor iCamaradaServidor;

    @GetMapping("path")
    public Page<CamaradaServidorModel> salvarCamaradaServidor(@RequestParam CamaradaServidorModel camaradaServidorModel) {
        return iCamaradaServidor.save(camaradaServidorModel, CamaradaServidorModel.class);
    }
    
}
