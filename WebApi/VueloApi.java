package WebApi;

// import org.json.JSONArray;
// import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import Domain.Model.Vuelos.Vuelo;
import kernel.http.HttpStatus;
import kernel.http.Exception.HttpException;
import kernel.http.annotation.DeleteMapping;
import kernel.http.annotation.GetMapping;
import kernel.http.annotation.PathVariable;
import kernel.http.annotation.PostMapping;
import kernel.http.annotation.PutMapping;
import kernel.http.annotation.RequestBody;
import kernel.http.annotation.RequestMapping;
import kernel.http.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import Application.Dto.Vuelo.VueloDto;
// import Application.Dto.AeronaveDto;
// import Application.UseCases.Command.Aeronaves.CrearAeronaveCommand;
// import Application.UseCases.Queries.Aeronaves.GetAeronaveByKeyQuery;
import Domain.Model.Aeronaves.*;
import kernel.http.HttpStatus;
import kernel.http.Exception.HttpException;
import kernel.http.annotation.*;
import kernel.mediator.Mediator;
import kernel.mediator.Response;

@RestController
@RequestMapping("/vuelo")

public class VueloApi {

    private Mediator _mediator;

    public VueloApi(Mediator mediator) {
        _mediator = mediator;
    }

    @GetMapping("/")
    public List<Vuelo> getAll() {
        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo());
        vuelos.add(new Vuelo());
        return vuelos;
    }

    // @GetMapping("/{key}")
    // public VueloDto getByKey(@PathVariable GetAeronaveByKeyQuery request) throws
    // HttpException {
    // AeronaveDto aeronaveDto = _mediator.send(request).data;
    // return aeronaveDto;
    // }

    @GetMapping("/{key}")
    public Vuelo getByKey(@PathVariable String key) throws HttpException {
        if (key.equals("1")) {
            throw new HttpException(HttpStatus.CONFLICT, "Not found");
        }
        System.out.println("entro getByKey");
        return new Vuelo();
    }

    @PostMapping("/registro")
    public Vuelo register(@RequestBody Vuelo vuelo) {

        // Gson aeve = new Gson(new Aeronave("bomfo", "2001"));

        // JSONArray arr = new JSONArray();
        // arr.put(new Gson().put("key", UUID.randomUUID().toString()).put("numero",
        // "1"));
        // arr.put(new Gson().put("key", UUID.randomUUID().toString()).put("numero",
        // "2"));
        // arr.put(new Gson().put("key", UUID.randomUUID().toString()).put("numero",
        // "3"));
        // arr.put(new Gson().put("key", UUID.randomUUID().toString()).put("numero",
        // "4"));
        // aeve.put("asientos", arr);

        // vuelo.AgregarAeronave(aeve);
        return vuelo;
    }

    @PutMapping("/{key}")
    public Vuelo edit(@RequestBody Vuelo vuelo, @PathVariable String key) {
        return vuelo;
    }

    @DeleteMapping("/{key}")
    public void delete(@PathVariable String key) {
        System.out.println("entro delete");
    }

}