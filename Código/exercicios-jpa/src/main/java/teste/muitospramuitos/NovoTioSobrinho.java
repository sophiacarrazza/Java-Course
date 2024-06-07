package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

    public static void main(String[] args) {
        Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("Joao");
        Sobrinho sobrinho1 = new Sobrinho("Hansel");
        Sobrinho sobrinha2 = new Sobrinho("Gretel");

        tia1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tia1);
        tia1.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tia1);
        tio2.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio2);
        tio2.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();
        dao.abrirTransacao()
                .incluir(tia1)
                .incluir(sobrinho1)
                .incluir(tio2)
                .incluir(sobrinha2)
                .fecharTransacao()
                .fecharEM();

    }
}
