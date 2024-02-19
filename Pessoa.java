public class Pessoa {
    private String name;
    private int age;
    private char sexo;
    private double peso;
    private double altura;
    private String corOlhos;
    private String corCabelos;
    private String corPele;
    
    public Pessoa(String name, int age, char sexo, double peso, double altura, String corOlhos, String corCabelos,
                    String corPele) {
        this.name = name;
        this.age = age;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.corOlhos = corOlhos;
        this.corCabelos = corCabelos;
        this.corPele = corPele;
    }

    public Pessoa() {
        
    }

    public Pessoa(String name) {
        this.name = name;    
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getCorOlhos() {
        return corOlhos;
    }
    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }
    public String getCorCabelos() {
        return corCabelos;
    }
    public void setCorCabelos(String corCabelos) {
        this.corCabelos = corCabelos;
    }
    public String getCorPele() {
        return corPele;
    }
    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
}
