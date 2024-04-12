import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rooms {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Thing> list = readThings("rooms.txt");
        HashMap<String,ArrayList<Thing>> rooms = sortRooms(list);
        countSumVolumeEachRoom(rooms);
    }

    private static void countSumVolumeEachRoom(HashMap<String, ArrayList<Thing>> rooms) {
        for (Map.Entry<String, ArrayList<Thing>> pair : rooms.entrySet()){
            System.out.print(pair.getKey()+": ");
            int sumVol = 0;
            for (Thing i : pair.getValue()){
                sumVol+=i.countVolume();
            }
            System.out.println(sumVol);
        }
    }

    public static ArrayList<Thing> readThings(String fname) throws FileNotFoundException {
        Scanner read = new Scanner(new File(fname));
        ArrayList<Thing> things = new ArrayList<>();
        while (read.hasNext()){
            Thing thing = new Thing(read.nextInt(), read.next(), read.nextInt(), read.nextInt(), read.nextInt(), read.next());
            things.add(thing);
        }
        return things;
    }
    public static HashMap<String,ArrayList<Thing>> sortRooms(ArrayList<Thing> things){
        HashMap<String,ArrayList<Thing>> rooms = new HashMap<>();
        for (Thing x: things){
            if (rooms.containsKey(x.getRoom())){
                rooms.get(x.getRoom()).add(x);
            }
            else {
                ArrayList<Thing> tmp = new ArrayList<>();
                tmp.add(x);
                rooms.put(x.getRoom(),tmp);
            }
        }
        return rooms;
    }
}
class Thing{
    String name;
    int num;
    int width, length, height;
    String room;
    public Thing(int number, String name, int w, int l, int h, String room){
        num = number;
        this.name = name;
        width = w;
        length = l;
        height = h;
        this.room = room;
    }
    public int countVolume(){
        return height*width*length;
    }

    public String getRoom() {
        return room;
    }
}
