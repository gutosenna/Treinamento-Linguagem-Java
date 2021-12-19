class ArrayFormas {
    public static void main(String[] args) {
        String[] cursos;
        cursos = new String[4];
        cursos [0] = "Redes";
        cursos [1] = "Internet";
        cursos [2] = "Sistemas";
        cursos [3] = "Manutencao";
        System.out.println(cursos + " ");

        //ou

        String cursos2[] = {"Redes", "Internet","Sistemas","Manutencao"};
        System.out.println(cursos2 + " ");

        //ou

        /*DataNasc dates[];
        dates = new DataNasc[3];
        dates[0] = new DataNasc(01, 01, 1998);
        dates[1] = new DataNasc(07, 09, 1995);
        dates[2] = new DataNasc(25, 12, 1990);*/

        //ou

        /*DataNasc dates2[] = { new DataNasc[3], new DataNasc(01, 01, 1998) , new DataNasc(07, 09, 1995),
        new DataNasc(25, 12, 1990); }*/

        //ou

        double notas[] = {8.0, 7.5, 9.0, 8.5};
        System.out.println(notas + " ");
        //formato reduzido

       // ou

        double[] notas2 = new double[] {8.0, 7.5, 9.0, 8.5};
        System.out.println(notas2 + " ");
    }
}