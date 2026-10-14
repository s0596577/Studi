package htw.bakar.studi.controller;

//Ein Controller nimmt eingehende HTTP-Anfragen (Requests) entgegen,
// verarbeitet diese (delegiert sie meistens weiter an einen Service)
// und gibt die Antworten (Responses) wieder zurück.
// Der Controller stellt somit die Schnittstelle nach außen dar.



import htw.bakar.studi.dto.RoleResponse;
import htw.bakar.studi.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<List<UserResponse>> getUsers()
    {
        List<UserResponse> result = List.of(
                new UserResponse(1L, "nameone", "one@mail.de", new RoleResponse(1L, "admin")),
                new UserResponse(2L, "nametwo", "two@mail.de", new RoleResponse(2L, "user"))
        );

        return ResponseEntity.ok(result);
    }

}