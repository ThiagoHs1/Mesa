package br.com.thiagoh;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.thiagoh.dao.DonoDao;
import br.com.thiagoh.dao.IDonoDao;
import br.com.thiagoh.domain.Acessorio;
import br.com.thiagoh.domain.Carro;
import br.com.thiagoh.domain.Dono;
import br.com.thiagoh.domain.Marca;
import br.com.thiagoh.dao.*;

public class MainTest {

    private IMarcaDao marcaDao;
    private ICarroDao carroDao;
    private IAcessorioDao acessorioDao;
    private IDonoDao donoDao;

    public MainTest(){
        marcaDao = new MarcaDao();
        carroDao = new CarroDao();
        acessorioDao = new AcessorioDao();
        donoDao = new DonoDao();
    }

    @Test
    public void cadastrarTest(){
        Marca marca = criarMarca("Teste");
        Carro carro = criarCarro("A1");
//        Carro carro2 = criarCarro("A2");
        Dono dono = criarDono("Thiago");


        marcaDao.cadastrar(marca);
        donoDao.cadastrar(dono);

        dono.setCarro(carro);
        carro.setMarca(marca);
        carroDao.cadastrar(carro);
//        carro2.setMarca(marca);
//        carro2.setDono(dono);
        assertNotNull(marca);
        assertNotNull(carro);
        assertNotNull(dono);




    }

    private Dono criarDono(String nome) {
        Dono dono = new Dono();
        dono.setCodigo("A1");
        dono.setNome(nome);
        dono.setPais("Brasil");
        dono.setTelefone(99999999l);
        return dono;
    }

    private Acessorio criarAcessorio(String codigo, String item) {
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo(codigo);
        acessorio.setNome(item);
        acessorio.setDescricao("Teto de vidro");
        acessorio.setValor(BigDecimal.valueOf(4000));
//        acessorioDao.cadastrar(acessorio);
        return acessorio;

    }

    private Carro criarCarro(String modelo) {
        Carro carro = new Carro();
        carro.setCodigo(modelo);
        carro.setNome(modelo);
        carro.setValor(BigDecimal.valueOf(300000));
        carro.setAno(2023);
        Acessorio acessorio = criarAcessorio("T1","Teto Solar");
        Acessorio acessorio2 = criarAcessorio("T2","Pelicula Solar");
        carro.addAcc(acessorio);
        carro.addAcc(acessorio2);
        return carro;

    }

    private Marca criarMarca(String nome) {
        Marca marca = new Marca();
        marca.setCodigo("M1");
        marca.setNome(nome);
        marca.setPais("Alemanha");
        return marca;
    }
}