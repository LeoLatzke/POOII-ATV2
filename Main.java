import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProjetoDAO projetoDAO = new ProjetoDAO();
        EngenheiroDAO engenheiroDAO = new EngenheiroDAO();
        OperarioDAO operarioDAO = new OperarioDAO();
        EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
        MaterialDAO materialDAO = new MaterialDAO();

        Projeto projeto = new Projeto("Construção do Prédio A", "Centro da Cidade", new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + 30 * 24 * 60 * 60 * 1000L));
        projetoDAO.inserir(projeto);
        System.out.println("Projeto inserido: " + projeto);

        Engenheiro engenheiro1 = new Engenheiro("Carlos Silva", "Civil");
        Engenheiro engenheiro2 = new Engenheiro("Ana Costa", "Estrutural");
        engenheiroDAO.inserir(engenheiro1);
        engenheiroDAO.inserir(engenheiro2);
        System.out.println("Engenheiros inseridos: " + engenheiro1 + ", " + engenheiro2);

        Operario operario1 = new Operario("João Pereira", "Mestre de Obras");
        Operario operario2 = new Operario("Maria Oliveira", "Pedreiro");
        operarioDAO.inserir(operario1);
        operarioDAO.inserir(operario2);
        System.out.println("Operários inseridos: " + operario1 + ", " + operario2);

        Equipamento equipamento1 = new Equipamento("Guincho", "Pesado");
        Equipamento equipamento2 = new Equipamento("Betoneira", "Leve");
        equipamentoDAO.inserir(equipamento1);
        equipamentoDAO.inserir(equipamento2);
        System.out.println("Equipamentos inseridos: " + equipamento1 + ", " + equipamento2);

        Material material1 = new Material("Cimento", 100);
        Material material2 = new Material("Areia", 200);
        materialDAO.inserir(material1);
        materialDAO.inserir(material2);
        System.out.println("Materiais inseridos: " + material1 + ", " + material2);

        projetoDAO.alocarEngenheiro(projeto.getIdProjeto(), engenheiro1.getIdEngenheiro());
        projetoDAO.alocarEngenheiro(projeto.getIdProjeto(), engenheiro2.getIdEngenheiro());
        projetoDAO.alocarOperario(projeto.getIdProjeto(), operario1.getIdOperario());
        projetoDAO.alocarOperario(projeto.getIdProjeto(), operario2.getIdOperario());
        projetoDAO.usarEquipamento(projeto.getIdProjeto(), equipamento1.getIdEquipamento());
        projetoDAO.usarEquipamento(projeto.getIdProjeto(), equipamento2.getIdEquipamento());
        projetoDAO.consumirMaterial(projeto.getIdProjeto(), material1.getIdMaterial(), material1.getQuantidade());
        projetoDAO.consumirMaterial(projeto.getIdProjeto(), material2.getIdMaterial(), material2.getQuantidade());

        System.out.println("Engenheiros alocados ao projeto: " + projetoDAO.listarEngenheirosPorProjeto(projeto.getIdProjeto()));
        System.out.println("Operários alocados ao projeto: " + projetoDAO.listarOperariosPorProjeto(projeto.getIdProjeto()));
        System.out.println("Equipamentos utilizados no projeto: " + projetoDAO.listarEquipamentosPorProjeto(projeto.getIdProjeto()));
        System.out.println("Materiais consumidos no projeto: " + projetoDAO.listarMateriaisPorProjeto(projeto.getIdProjeto()));

        projeto.setNomeProjeto("Construção do Prédio A - Atualizado");
        projetoDAO.atualizar(projeto);
        System.out.println("Projeto atualizado: " + projetoDAO.buscarPorId(projeto.getIdProjeto()));

        projetoDAO.excluir(projeto.getIdProjeto());
        System.out.println("Projeto excluído.");

        ConexaoBD.getInstancia().fecharConexao();
    }
}
