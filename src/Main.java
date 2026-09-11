import java.util.ArrayList;
public void main() {
    String[] classmates = {"Abdullahi Abdullahi", "Jacob Cruz", "MAGAN FARAH", "GARETH FLANDRO", "Leonardo Glorioso", "Muhtasim Haq","ALI INDIA", "Colette Kennedy", "FRANCO MENDOZA", "Ilyas Mohamed", "Satyam Nandi", "Hano Roughley", "ALBERT ZHANG", "ARRIAN MORSHED"
    };

    for (int i =0; i < 14; i++){
        System.out.println(classmates[i]);
    }
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    for(Integer numb: numbers){
        System.out.println(numb);
    }

    HashSet<Integer> numero = new HashSet<>();
    numero.add(1);
    numero.add(2);
    numero.add(3);
    numero.add(4);
    numero.add(5);

    for (Integer numberss:numero){
        System.out.println("number " + numberss);
    }

}

