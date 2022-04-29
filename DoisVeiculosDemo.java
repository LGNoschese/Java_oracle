class Veiculo {
    int passageiros;
    int combustivel;
    int mpg;
}
class DoisVeiculos {
    public static void main(String[] args) {
    Veiculo minivan = new Veiculo();
    Veiculo sportscar = new Veiculo();

    int range1, range2;

    minivan.passageiros = 7;
    minivan.combustivel = 16;
    minivan.mpg = 21;

    sportscar.passageiros = 2;
    sportscar.combustivel = 14;
    sportscar.mpg = 12;
    
    range1 = minivan.combustivel * minivan.mpg;
    range2 = sportscar.combustivel * sportscar.mpg;

    System.out.println("Minivan can Carry " + minivan.passageiros + " whith a range of " + range1);
    System.out.println("Sportscar can Carry " + sportscar.passageiros + " whith a range of " + range2);
    }
}