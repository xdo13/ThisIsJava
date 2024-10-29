package ch17.sec04;

public class Product {
    // 상품 속성
    private int pno;
    private String name;
    private String company;
    private int price;

    // 상품 객체를 초기화하는 생성자
    public Product(int pno, String name, String company, int price) {
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }
    //반환하는 getter 메소드
    public int getPno() {
        return pno;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }
    @Override
    public String toString(){ //toString을 통해 하나로 묶어서 리턴
        return new StringBuilder()
                .append("{")
                .append("pno:" + pno + ", ")
                .append("name:" + name + ", ")
                .append("company: " + company + ", ")
                .append("price:" + price)
                .append("}")
                .toString();
    }
}
