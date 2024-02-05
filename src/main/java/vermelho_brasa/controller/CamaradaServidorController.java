package vermelho_brasa.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vermelho_brasa.model.CamaradaServidorModel;
import vermelho_brasa.service.ICamaradaServidorService;



@RestController
@RequestMapping(value = "/camaradaServidor")
@RequiredArgsConstructor
public class CamaradaServidorController {

    private final ICamaradaServidorService iCamaradaServidorService;

    @GetMapping("path")
    public CamaradaServidorModel salvarCamaradaServidor(@RequestParam CamaradaServidorModel camaradaServidorModel) {
        return iCamaradaServidorService.save(camaradaServidorModel);
    }
    
}
