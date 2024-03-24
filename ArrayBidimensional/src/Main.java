import java.sql.Date;

public class Main {

    public static void main(String[] args){
        Estudante[] estudantes = new Estudante[3];

        Estudante Roberto = new Estudante(65, "Roberto Menezes", new Date(1998, 11, 25), "Ing-A1");
        Estudante Gilberto = new Estudante(68, "Gilberto Fernandez", new Date(2005, 2, 25), "Fran- A1");
        Estudante Eliberto = new Estudante(69, "Eliberto Fagundes", new Date(1995, 4, 1), "Ing-A1");



        String[][] turma = new String[2][3];
        int index = 0;
        turma[0][0] = "Ing-A1";
        turma[1][0] = "Fran-A1";
        turma[0][1] = Roberto.getNome();
        turma[1][1] = Gilberto.getNome();
        turma[0][2] = Eliberto.getNome();

        do{
            for(int i = 0;i <= 2;i++){
                if(turma[index][i] == null){
                    turma[index][i] = "Sem aluno";
                }
                System.out.println(turma[index][i]);;
            }
            System.out.println("");
            index++;
        }while(index <= 1);

    }


}
