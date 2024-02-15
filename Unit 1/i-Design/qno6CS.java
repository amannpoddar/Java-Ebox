        //fill your code here
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        int agg=0;
        for(int i=0; i<3; i++){
            marks[i] = sc.nextInt();
            agg += marks[i];
        }
        int avg = agg/3;
        if(avg<50){
        System.out.println( "The grade is F");
        }
        else if(avg>=50 && avg <60){
        System.out.println("The grade is E");
        }
        else if(avg >=60 && avg<70){
        System.out.println("The grade is D");
        }
        else if(avg >= 70 && avg <80){
        System.out.println("The grade is C");
        }
        else if(avg >= 80 && avg <90){
        System.out.println("The grade is B");
        }
        else
        System.out.println("The grade is A"); 
    }
}