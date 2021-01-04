package com.carros.api;

import com.carros.domain.CarrosService;
import org.springframework.web.bind.annotation.*;
import com.carros.domain.Carro;
import java.util.List;

@RestController // esta notação indica que este arquivo é um webservice
@RequestMapping("/api/v1/carros")

public class CarrosController {

    private CarrosService service = new CarrosService();

    @GetMapping
    public List<Carro> get(){
        return service.getCarros();
    }


}
