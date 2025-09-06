package Interface;

public class class01 {
    public static void main(String[] args) {
        class01 c = new class01();

        Queen q = c.new Queen();
        q.moves();
        Rook r = c.new Rook();
        r.moves();

        bear b = c.new bear();
        b.eats();
        b.teeth();
    }

    // 1 interface defualt public ,abstract and we cannot implement
    interface ChessPlayer {
        void moves();
    }

    class Queen implements ChessPlayer {
        public void moves() {
            System.out.println("queen moves- up,dowm,left,right,diagonal in all 4 directions");
        }
    }

    class Rook implements ChessPlayer {
        public void moves() {
            System.out.println("Rook moves- up,dowm,left,right");
        }
    }

    class King implements ChessPlayer {
        public void moves() {
            System.out.println("King moves- up,dowm,left,right,diagonal in step");
        }
    }

    // 2) multiple inheritance

    interface Herbivore {
        void eats();
    }

    interface Carnivore {
        void teeth();
    }

    class bear implements Herbivore, Carnivore {
        public void eats() {
            System.out.println("eats plants and grass");
        }

        public void teeth() {
            System.out.println("have sharp teeth");

        }
    }

}
