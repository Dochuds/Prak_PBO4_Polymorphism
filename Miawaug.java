public class Miawaug extends Animal {
    private int jumMata;
    private String jenis;
    
    public Miawaug(){
        jumMata = 1;
    }
    
    public Miawaug(int jumMata, String jenis){
        this.jumMata = jumMata;
        this.jenis = jenis;
    }

    @Override
    public void suara() {
        System.out.println("Miawauuuuuugg....");
    }   

    public String toString() {
        return "Miawaug{" + "jumMata=" + jumMata + ", jenis=" + jenis + '}';
    }
    
    
}
