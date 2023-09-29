package oleg.sichev.containerstests.controller;

import lombok.AllArgsConstructor;
import oleg.sichev.containerstests.profiles.SystemProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ProfileController {
    private SystemProfile profile;

    @GetMapping("profile")
    String getProfile() {
        return profile.getProfile();
    }


}
