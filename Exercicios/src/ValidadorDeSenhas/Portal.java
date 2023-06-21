package ValidadorDeSenhas;

public class Portal {

    private String senha;

    public Portal(String senha){
        this.senha = senha;
    }

    public Portal(){
        senha = "";
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    private boolean hasLowerCase(){
        String[] letras = senha.split("");
        for(int i = 0; i < letras.length; i++){
            if(Character.isLowerCase(letras[i].charAt(0))){
                return true;
            }
        }
        return false;
    }

    private boolean hasUpperCase(){
        String[] letras = senha.split("");
        for(int i = 0; i < letras.length; i++){
            if(Character.isUpperCase(letras[i].charAt(0))){
                return true;
            }
        }
        return false;
    }

    private boolean hasNumber(){
        String[] letras = senha.split("");
        for(int i = 0; i < letras.length; i++){
            if(Character.isDigit(letras[i].charAt(0))){
                return true;
            }
        }
        return false;
    }

    private boolean hasSpecialCharacter(){
        String[] letras = senha.split("");
        for(int i = 0; i < letras.length; i++){
            if(!Character.isLetterOrDigit(letras[i].charAt(0))){
                return true;
            }
        }
        return false;
    }

    private boolean isInRange(){
        int qtdCaracteres = 0;
        String[] letras = senha.split("");
        for(int j = 0; j < letras.length; j++){
            qtdCaracteres++;
        }
        return qtdCaracteres >= 6 && qtdCaracteres <= 32;
    }

    public boolean isSenhaValida(){
        return hasUpperCase() && hasLowerCase() && hasNumber() && isInRange() && !hasSpecialCharacter();
    }

}