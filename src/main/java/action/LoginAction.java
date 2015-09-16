package action;

import com.opensymphony.xwork2.ActionSupport;
import model.User;

/**
 * Created by apple on 2015/9/11.
 */
public class LoginAction extends ActionSupport {
        private String username;
        private String password;
        private String result;

        public String execute(){
                result="success";
                return "success";
        }



        public String getResult() {
                return result;
        }

        public void setResult(String result) {
                this.result = result;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public void setUsername(String username) {
                this.username = username;
        }
}
