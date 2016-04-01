/**
 * $Id: TestJson.java,v 1.0 2016/11/10 16:53 jacky Exp $
 * <p/>
 * Copyright 2016 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.json.Group;

import com.json.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jacky
 * @version $Id: TestJson.java,v 1.1 2016/11/10 16:53 jacky Exp $
 * Created on 2016/11/10 16:53
 */
public class TestJson {
    @Test
    public void TestJson()
    {
        Group group = new Group();
        group.setGroupId(1L);
        group.setGroupName("admin");

        User guestUser = new User();
        guestUser.setUserId(2L);
        guestUser.setUserName("guest");

        User rootUser = new User();
        rootUser.setUserId(3L);
        rootUser.setUserName("root");
        List<User> groupUsers = new ArrayList<User>();
        groupUsers.add(guestUser);
        groupUsers.add(rootUser);
        group.setGroupUsers(groupUsers);
        String jsonString = JSON.toJSONString(group);

        System.out.println(jsonString);
        Group a=JSON.parseObject(jsonString,Group.class);
        System.out.println(jsonString);
    }
}
