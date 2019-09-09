import java.util.Scanner;
 
public class FichaCatalografica {
 
    public static final int tamanho = 501;
   
    private int codigo;
    private int paginas;
    private boolean status;
    private String nome;
    private String autor;
    private String editora;
   
    public FichaCatalografica(int c, boolean s, String n, String a, String e, int p){
        this.codigo = c;
        this.status = s;
        this.nome = n;
        this.autor = a;
        this.editora = e;
        this.paginas = p;
    }
    public FichaCatalografica(){
    }
 
    public void setCodigo(int c){
        this.codigo = c;
    }
    public void setPaginas(int p){
        this.paginas = p;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setEditora(String e){
        this.editora = e;
    }
    public void setAutor(String a){
        this.autor = a;
    }
 
    public int getCodigo(){
        return this.codigo;
    }
    public int getPaginas(){
        return this.paginas;
    }
    public boolean getStatus(){
        return this.status;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEditora(){
        return this.editora;
    }
    public String getAutor(){
        return this.autor;
    }
 
    public static void imprime (FichaCatalografica l){
       
        System.out.println(----------------------------------------);
        System.out.println("Codigo = "+l.getCodigo());
        System.out.println("Nome da Obra = "+l.getNome());
        System.out.println("Nome do Autor = "+l.getAutor());
        System.out.println("Nome da Editora = "+l.getEditora());
        System.out.println("Total de Paginas = "+l.getPaginas());
		System.out.println(----------------------------------------);
       
        if(l.getStatus()) System.out.println("O livro foi doado");
            else System.out.println("O livro foi comprado");
           
            System.out.println();
    }
   
   
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
       
        boolean doado= false, verificacao= false,cont = false,titulo=false;
        int op= 0,codigo=600,area,verificar;
       
       
       
       
        FichaCatalografica[] Exatas = new FichaCatalografica[tamanho];
        FichaCatalografica[] Biomedicas = new FichaCatalografica[tamanho];
        FichaCatalografica[] Humanas = new FichaCatalografica[tamanho];
       
       
        //Humanas[1]= new Livro(1,true,"Victor1", "Budal33", "Editora",2);
        //Biomedicas[1]= new Livro(1,true,"Victor2", "Budal144", "Editora",2);
        //Exatas[1]= new Livro(1,true,"Victor3", "Budal55", "Editora",2);
       
        //Preencher Vetor Humanas
        for(int i = 0; i<tamanho ; i++){
            Humanas[i]= new FichaCatalografica();
            if(i%2==0){
                Humanas[i].setStatus(true);
                Humanas[i].setAutor(" Luiz Jonson");
                Humanas[i].setCodigo(i);
                Humanas[i].setEditora("Globo");
                Humanas[i].setPaginas(30*i);
                Humanas[i].setNome("A caminho da Verdade");
            }else{
                Humanas[i].setStatus( false);
                Humanas[i].setAutor("Marina Juis") ;
                Humanas[i].setCodigo(i);
                Humanas[i].setEditora("Band");
                Humanas[i].setPaginas(345+i);
                Humanas[i].setNome("A lei da Natureza") ;
            }
        }
       
        //Preencher Vetor Exatas
        for(int j = 0; j<tamanho ; j++){
            Exatas[j]= new FichaCatalografica();
            if(j%2==0){
                Exatas[j].setStatus(true);
                Exatas[j].setAutor("Antonio Carlos");
                Exatas[j].setCodigo(j);
                Exatas[j].setEditora("Fake News");
                Exatas[j].setPaginas(30*j);
                Exatas[j].setNome("A caminho da Programação");
            }else{
                Exatas[j].setStatus(false);
                Exatas[j].setAutor("Marcos Aurelio") ;
                Exatas[j].setCodigo(j);
                Exatas[j].setEditora("MTV");
                Exatas[j].setPaginas(380+j);
                Exatas[j].setNome("A origen dos Numeros") ;
            }
        }
       
        //Preencher Vetor Biomedicas
        for(int i = 0; i<tamanho ; i++){
            Biomedicas[i]= new FichaCatalografica();
            if(i%2==0){
                Biomedicas[i].setStatus(false);
                Biomedicas[i].setAutor(" Luiz Jonson");
                Biomedicas[i].setCodigo(i);
                Biomedicas[i].setEditora("Globo");
                Biomedicas[i].setPaginas(30*i);
                Biomedicas[i].setNome("A caminho da Verdade");
            }else{
                Biomedicas[i].setStatus(true);
                Biomedicas[i].setAutor("Mario Augusto") ;
                Biomedicas[i].setCodigo(i);
                Biomedicas[i].setEditora("Biologicas");
                Biomedicas[i].setPaginas(544-i);
                Biomedicas[i].setNome("A cura da AIDS") ;
            }
        }
       
   
       
       
        while(true){
			System.out.println("--------------------------------------");
            System.out.println("Menu");
            System.out.println();
            System.out.println("Digite 1 para fazer a consulta");
            System.out.println("Digite 2 para listar obras");
            System.out.println("Digite 3 para listar todas as obras com mais de 100 paginas");
            System.out.println("Digite 4 para alterar");
            System.out.println("Digite 5 para excluir");
            System.out.println("Digite 6 para sair");
			System.out.println("--------------------------------------");
            op = scan.nextInt();
           
            if(op==6) break;
           
           
            else if(op==1){
               
                while(true){
                    cont = false;
                    while(!cont){
                        cont = true;
                        System.out.println("Digite o codigo da obra ou -1 para voltar");
                        codigo = scan.nextInt();
                   
                        if(codigo == -1){
                            titulo =true;
                           
                        }
                       
                       
                        else if(codigo>500){
                            System.out.println("Erro no codigo tente novamente");
                            cont = false;
                        }
                       
                    }
                    if(titulo)break;
                   
                    System.out.println("Digite a area.1-Exatas,2-Biomedicas,3-Humanas)");
                    area = scan.nextInt();
                    while(area>3){
                        System.out.println("Erro por favor digite 1, 2 ou 3.");
                        area = scan.nextInt();
                       
                    }
                   
                    if(area == 1){
               
                            imprime(Exatas[codigo]);
                           
                        }
                           
                                   
                               
                       
                   
                    if(area == 2){
                        imprime(Biomedicas[codigo]);
                       
                        }
       
                    if(area== 3){
                        imprime(Humanas[codigo]);
                   
                    }
                   
                }
                   
            }else if(op == 2)/*opcao 2*/{
                cont =false;
               
                System.out.println("Exatas");
               
                for(int i =0 ; i<tamanho;i++){
                   
                    if(Exatas[i].getStatus()){
                        System.out.println(Exatas[i].getNome());
                        cont=true;
                    }
                }
               
                if(!cont){
                        System.out.println("Não tem nenhum livro de Exatas doado");
                    }
               
                System.out.println();
               
                cont= false;
                System.out.println("Biomedicas");
               
                for(int i = 0 ; i<tamanho;i++){
                    if(Biomedicas[i].getStatus()){
                        System.out.println(Biomedicas[i].getNome());
                        cont=true;
                    }
                }
               
                if(!cont){
                        System.out.println("Não tem nenhum livro de Biomedicas doado");
                    }
               
                System.out.println();
               
                cont=false;
               
                System.out.println("Humanas");
               
                for(int i = 0 ; i<tamanho;i++){
                   
                    if(Humanas[i].getStatus()){
                       
                        System.out.println(Humanas[i].getNome());
                        cont= true;
                    }  
                }
                   
                if(!cont){
                System.out.println("Não tem nenhum livro de Humanas doado");
                }
                System.out.println();
                cont= false;
               
               
           
                }else if(op == 3)/*opcao3*/{
                    cont = false;
                   
                    System.out.println();
                    System.out.println("Exatas");
                   
                    for(int i = 0 ; i<tamanho; i++){
                        if(!Exatas[i].getStatus() && Exatas[i].getPaginas()>=100 && Exatas[i].getPaginas()<300){
                            System.out.println(Exatas[i].getNome());
                            cont = true;
                        }
                       
                    }
                    if(!cont){
                        System.out.println("Nao possui livros com 100 a 300 paginas em Exatas");
                    }
                    cont =false;
                   
                    System.out.println();
                    System.out.println("Biomedicas");
                   
                    for(int i = 0 ; i<tamanho; i++){
                        if(!Biomedicas[i].getStatus() && Biomedicas[i].getPaginas()>=100 && Biomedicas[i].getPaginas()<300){
                            System.out.println(Biomedicas[i].getNome());
                            cont= true;
                        }
                    }
                   
                    if(!cont){
                        System.out.println("Nao possui livros com 100 a 300 paginas em Biomedicas");
                    }
                    cont =false;
                   
                    System.out.println();
                    System.out.println("Humanas");
                   
                    for(int i = 0 ; i<tamanho; i++){
                        if(!Humanas[i].getStatus() && Humanas[i].getPaginas()>=100 && Humanas[i].getPaginas()<300){
                            System.out.println(Humanas[i].getNome());
                            cont = true;
                        }
                    }
               
               
                    if(!cont){
                        System.out.println("Nao possui livros com 100 a 300 paginas em Humanas");
                    }
                   
                    cont =false;
                   
                    }else if (op==4)/*opcao4*/{
                        cont = false;
                            while(!cont){
                                cont = true;
                                System.out.println("Digite o codigo da obra");
                                codigo = scan.nextInt();
                               
                                if(codigo>500){
                                    System.out.println("Erro no codigo tente novamente");
                                    cont = false;
                                }
                            }
                       
                        System.out.println("Digite a area.1-Exatas,2-Biomedicas,3-Humanas)");
                        area = scan.nextInt();
                        while(area>3){
                            System.out.println("Erro por favor digite 1, 2 ou 3.");
                            area = scan.nextInt();
                           
                            }
                       
                        if(area == 1){
                   
                                //alterar(Exatas[codigo]);
                               
                            }
                               
                                       
                                   
                           
                       
                        if(area == 2){
                            imprime(Biomedicas[codigo]);
                           
                            }
           
                        if(area== 3){
                            imprime(Humanas[codigo]);
                       
                            }
               
                        }else if(op == 5)/*opcao5*/{
                            while(true){
                                System.out.println("Deseja realmente excluir um livro?  ");
                                System.out.println("digite 1 para sim ");
                                System.out.println("digite 2 para não ");
                                verificar = scan.nextInt();
                                if(verificar==2)break;
                                if(verificar==1){
                                    cont = false;
                                    while(!cont){
                                        cont = true;
                                        System.out.println("digite o codigo do livro ");
                                        codigo = scan.nextInt();
                                        if(codigo>500){
                                            System.out.println("Codigo invalido por favor tente novamente.");
                                            cont =false;
                                        }
                                    }
                                    System.out.println("Digite a area.1-Exatas,2-Biomedicas,3-Humanas)");
                                    area= scan.nextInt();
                                    while(area>3){
                                        System.out.println("Erro por favor digite 1, 2 ou 3.");
                                        area = scan.nextInt();
                       
                                    }
                                    if(area==1){
                                        Exatas[codigo]=null;
                                        System.out.println("Exclusão concluida com sucesso");
                                        break;
                                    }
                                   
                                    if(area==2){
                                        Biomedicas[codigo]=null;
                                        System.out.println("Exclusão concluida com sucesso");
                                        break;
                                    }
                                   
                                    if(area==3){
                                        Humanas[codigo]=null;
                                        System.out.println("Exclusão concluida com sucesso");
                                        break;
                                    }
                                }  
                            }
            }
        }  
     System.out.println("Voce fechou o programa"); 
    }      
 
}