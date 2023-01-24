package primeiro_projeto;

public class Livros {

	public static void main(String[] args) {
	
		String[][] livros = {
                {"Malala, a menina que queria ir para a escola", "Adriana Carranca", "21.90", "B"},
                {"A revolução dos bichos: Um conto de fadas", "George Orwell", "8.50", "A"},
                {"Amoras", "Emicida", "19.90",  "B"},
                {"Perigoso!", "Tim Warnes", "16.90", "A"},
                {"O morro dos ventos uivantes", "Emily Brontë", "12.90", "A"},
                {"Maus", "Art Spiegelman", "34.90", "C"},
                {"Auto da compadecida", "Ariano Suassuna", "31.30",  "A"},
                {"Extraordinário", "R.J Palacio", "35.90",  "C"}
        };

        String[][] promocoes = {
                {"A", "10/01/2023", "15/01/2023",  "5"},
                {"B", "10/01/2023", "20/01/2023",  "10"},
                {"C", "11/01/2023", "30/01/2023",  "15"}
        };

        System.out.printf("%-50s\t%-20s\t%-15s\t%-9s\t%-10s\t%-19s\t%-16s%n",
                "*Nome do Livro",
                "*Autor",
                "*Preço Original",
                "*Preço Promocional",
                "*Desconto",
                "*Início da Promoção",
                "*Fim da Promoção");

        for (int indiceLivro = 0; indiceLivro < livros.length; indiceLivro++) {
            String nomeLivro = livros[indiceLivro][0];
            String autorLivro = livros[indiceLivro][1];
            double precoOriginal = Double.parseDouble(livros[indiceLivro][2]);
            String tipoPromocao = livros[indiceLivro][3];
            int porcentagem = 0;
            String dataInicioPromocao = "";
            String dataFimPromocao = "";
            double precoPromocional = 0;

            for (int indicePromocao = 0; indicePromocao < promocoes.length; indicePromocao++) {
                if (tipoPromocao.equals(promocoes[indicePromocao][0])) {
                    porcentagem = Integer.parseInt(promocoes[indicePromocao][3]);
                    dataInicioPromocao = promocoes[indicePromocao][1];
                    dataFimPromocao = promocoes[indicePromocao][2];
                    precoPromocional = precoOriginal * (1 - (porcentagem / 100.0));
                    break;
                }
            }

            System.out.printf("%-50s\t%-20s\t%15.2f\t%18.2f\t%8d%%\t%19s\t%16s%n",
                    nomeLivro,
                    autorLivro,
                    precoOriginal,
                    precoPromocional,
                    porcentagem,
                    dataInicioPromocao,
                    dataFimPromocao);
        }
    }
}

	