package demo;
import com.jfinal.core.Controller;
public class HelloController extends Controller {
    public void index() {
       renderText("Hello JFinal World.");
    }
    /**
     * 打开登录页面
     */
    public void openlogin() {
    	render("login.html");
    }
    /**
     * 登录
     */
    public void login() {
    	//1、判断用户名是否存在？
    	//2、如果存在，就判断密码？
    	//3、如果密码正确，就跳入主页面
    	//4、如果密码错误，就回到登录页面，提示密码错位
    	//5、如果用户不存在，就回到登录页面，提示用户不存在
    	
    	String username=getPara("username");
    	String password=getPara("password");
    	
    	//模拟mongodb数据库的用户名和密码
    	String user="201703";
    	String pw="123";
    	
    	//开始判断
    	if(username.equals(user)) {//1、判断用户名是否存在？
    		
    		if(password.equals(pw)) {//3、如果密码正确，就跳入主页面
    			
    			setAttr("result", 0);//密码正确
    			renderJson();
    			
    		}else {//4、如果密码错误，就回到登录页面，提示密码错位
    			setAttr("result", 1);//密码错误
    			renderJson();
    		}
    		
    	}else {//5、如果用户不存在，就回到登录页面，提示用户不存在
    		setAttr("result", -1);//用户不存在
			renderJson();
    		
    	}
    	
    }
    /**
     * 进入主页面
     */
    public void main() {
    	render("main.html");
    }
    
}
