public class ConexaoBD import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

public class ConexaoBD {
    private static ConexaoBD instancia;
    private Connection conexao;

    private static final String URL = "jdbc:mysql://localhost:3306/construcao";
    private static final String USUARIO = "root";
    private static final String SENHA = "password";

    private ConexaoBD() {
        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static synchronized ConexaoBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexaoBD();
        }
        return instancia;
    }

    public Connection getConexao() {
        return conexao;
    }

    public void fecharConexao() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
