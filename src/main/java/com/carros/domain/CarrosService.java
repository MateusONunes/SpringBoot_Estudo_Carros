package com.carros.domain;
import com.carros.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarrosService {
    public List<Carro> getCarros(){
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro(1L, "Fusca"));
        carros.add(new Carro(2L, "Brasilia"));
        carros.add(new Carro(3L, "Celta"));
        carros.add(new Carro(4L, "Fiesta"));
        carros.add(new Carro(5L, "Mercedes"));

        return carros;
    }
}
