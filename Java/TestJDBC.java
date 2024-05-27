package test.jdbc;
/**
 * JDBC 7step
1. Driver loading & Registry
    (사용할 DB에 대한 jdbc클래스를 알고 있어야 함, 등록은 자동)
1-1. Class.forName("드라이버 클래스명");
    // ex) Oracle : oracle.jdbc.driver.OracleDriver.class
2. Connection가져오기
2-1. DriverManager.getConnection(jdbcUrl, user, pwd);
    // ex) Oracle url : jdbc:oracle:thin:@localhost:1521:xe
3. Statement(명령문) 생성(sql)
3-1. [2-1객체].createStatement();
3-2. String sql = sql명령어
4. execute
4-1. [3-1객체].excute(sql);
5. Result(Record)Set - select명령을 수행할 경우
5-1. ResultSet result = [4-1]의 결과
6. next(); getOoo();
6-1. result.next(); // 다음 데이터가 있니? 있으면 준비해
6-2. String data = result.getString();// 데이터를 가져와라
7. close(); // 모든 객체는 닫아야 함([2-1객체 : conn], [3-1객체:stmt], [5-1객체:result])
7-1. result.close();  stmt.close(); conn.close();
 * @author User
 *
 */
public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
