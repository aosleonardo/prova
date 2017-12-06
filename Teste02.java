import java.util.ArrayList;
import java.util.List;

public class Teste02 {

    public static void main(String[] args) {
        //Gerando a Arvore
        List<Node> track = new ArrayList<>();
        Integer targetValue = 0;
        Node tree = new Node(0);
        for (int i = 0; i < 10; i++) {
            targetValue = Double.valueOf(Math.random() * 1000).intValue();
            tree.addNode(targetValue);
        }

        search(tree, targetValue, track);
        System.out.println(track.stream().mapToInt(node -> node.value).sum());
    }

    private static Boolean search(Node node, Integer value, List<Node> track) {
        if (node == null) {
            return false;
        }

        if ( node.value.equals(value)) {
            track.add(node);
            return true;
        }

        if(search(node.right,value, track ) || search(node.left,value, track )) {
            track.add(0, node);
        }

        return false;
    }
}

class Node {

    public Integer value;
    public Node right;
    public Node left;

    public Node(Integer value) {
        this.value = value;
    }

    public void addNode(Integer num) {
        if (num < this.value) {
            if (this.left != null) {
                this.left.addNode(num);
            } else {
                this.left = new Node(num);
            }
        } else {
            if (this.right != null) {
                this.right.addNode(num);
            } else {
                this.right = new Node(num);
            }
        }

    }
}
