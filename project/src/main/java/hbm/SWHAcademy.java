package hbm;

	/**
	 * <pre>
	 * kr.co.swh.lecture.opensource.hibernate.hbm
	 * SWHAcademy.java
	 *
	 * ���� : ���̹�����Ʈ ���� ��� Ŭ����
	 * </pre>
	 * 
	 * @since : 2017. 10. 26.
	 * @author : tobby48
	 * @version : v1.0
	 */
	public class SWHAcademy {
		String id;
		String name;
		String email;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	}
