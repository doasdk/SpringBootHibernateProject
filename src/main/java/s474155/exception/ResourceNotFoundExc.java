package s474155.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExc extends Exception {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundExc(String mes){
        super(mes);
    }
}