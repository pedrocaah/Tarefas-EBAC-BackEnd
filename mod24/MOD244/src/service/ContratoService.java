package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;

    }

    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Busca Sucess";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "excluir Sucess";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizar Sucess";
    }
}
