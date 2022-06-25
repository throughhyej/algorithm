package basic.datastructure;

public class LinkListStack {

    /**
     * 선입된 데이터가 다음 데이터의 value를 갖는 게 아님
     * 후입된 데이터가 이전 데이터의 value를 갖는 구조
     */

    private Link first;

    public LinkListStack() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(int d1, double d2) {
        Link link = new Link(d1, d2);
        link.nextLink = first; // 새로운 데이터의 다음 데이터를 null 처리
        first = link;
    }

    public Link delete() {
        Link temp = first;
        first = first.nextLink;
        return temp;
    }

    public void printList() {
        Link currentLink = first;
        System.out.print("## List: ");
        while (currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }

    class Link {

        private int data1;
        private double data2;
        private Link nextLink;

        public int getData1() {
            return data1;
        }

        public Link(int d1, double d2) {
            data1 = d1;
            data2 = d2;
        }

        public void printLink() {
            System.out.print("{" + data1 + ", " + data2 + "} ");
        }

    }


    public static void main(String[] args) {
        LinkListStack list = new LinkListStack(); // first = null

        list.insert(1, 100);
        list.insert(2, 200);
        list.insert(3, 300);
        list.insert(4, 400);
        list.insert(5, 500);

        list.printList();
        System.out.println("=====================================================");

        while (!list.isEmpty()) {
            Link deleteLink = list.delete();
            System.out.print("deleted: " );
            deleteLink.printLink();
            System.out.println("");
        }

        System.out.println("=====================================================");
        list.printList();

    }

}
