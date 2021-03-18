package projectdefence.service;

import projectdefence.models.binding.EditProfileBindingModel;
import projectdefence.models.serviceModels.UserServiceChangeRoleModel;
import projectdefence.models.serviceModels.UserServiceModel;
import projectdefence.models.viewModels.UserWrapInfoViewModel;

import java.io.IOException;
import java.util.List;

public interface UserService {
    boolean register(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);


    void changeRole(UserServiceChangeRoleModel userServiceModel, String role);

    void downgradeRole(UserServiceChangeRoleModel userServiceChangeRoleModel, String role);


    void deleteUserByUsername(String username);

    List<UserWrapInfoViewModel> findAllUsers();

    Integer findByTitleKT();

    Integer findByTitleClient();

    boolean findByUsername(String username);


    String findImageByUsername(String image);

    List<UserWrapInfoViewModel> findAllUsersByKinesiotherapist(String name);

    UserWrapInfoViewModel findProfileByUserName(String username);


    boolean editProfile(UserServiceModel userServiceModel, String username) throws IOException;
}
