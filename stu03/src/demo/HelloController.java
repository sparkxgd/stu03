package demo;
import com.jfinal.core.Controller;
public class HelloController extends Controller {
    public void index() {
       renderText("Hello JFinal World.");
    }
    /**
     * �򿪵�¼ҳ��
     */
    public void openlogin() {
    	render("login.html");
    }
    /**
     * ��¼
     */
    public void login() {
    	//1���ж��û����Ƿ���ڣ�
    	//2��������ڣ����ж����룿
    	//3�����������ȷ����������ҳ��
    	//4�����������󣬾ͻص���¼ҳ�棬��ʾ�����λ
    	//5������û������ڣ��ͻص���¼ҳ�棬��ʾ�û�������
    	
    	String username=getPara("username");
    	String password=getPara("password");
    	
    	//ģ��mongodb���ݿ���û���������
    	String user="201703";
    	String pw="123";
    	
    	//��ʼ�ж�
    	if(username.equals(user)) {//1���ж��û����Ƿ���ڣ�
    		
    		if(password.equals(pw)) {//3�����������ȷ����������ҳ��
    			
    			setAttr("result", 0);//������ȷ
    			renderJson();
    			
    		}else {//4�����������󣬾ͻص���¼ҳ�棬��ʾ�����λ
    			setAttr("result", 1);//�������
    			renderJson();
    		}
    		
    	}else {//5������û������ڣ��ͻص���¼ҳ�棬��ʾ�û�������
    		setAttr("result", -1);//�û�������
			renderJson();
    		
    	}
    	
    }
    /**
     * ������ҳ��
     */
    public void main() {
    	render("main.html");
    }
    
}
