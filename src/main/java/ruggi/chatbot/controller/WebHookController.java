package ruggi.chatbot.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ruggi.chatbot.entity.*;
import ruggi.chatbot.entity.response.CustomResponse;
import ruggi.chatbot.entity.response.MessageResponse;
import ruggi.chatbot.entity.response.MessagesResponse;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/webhook")
public class WebHookController  {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CustomResponse webHook(@Valid @RequestBody String webHookBody) {
        System.out.println(webHookBody);



        CustomResponse customResponse = new CustomResponse();
        FulfillmentMessages fulfillmentMessages = new FulfillmentMessages();
        Text text = new Text();
        text.getText().add("hola-ruggilock");
        fulfillmentMessages.setText(text);
        customResponse.getFulfillmentMessages().add(fulfillmentMessages);

        return customResponse;
    }
}
