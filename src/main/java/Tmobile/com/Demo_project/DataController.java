package Tmobile.com.Demo_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {

    RecordService dataService;

    public DataController(RecordService dataService) {
        this.dataService = dataService;
    }

    @PostMapping
    public ReturnData addNewData(@RequestBody ReturnData record){
        return dataService.addRecord(record);

    }

    @GetMapping
    public List<ReturnData> getAllData(){
        return  dataService.getAllData();
    }

}
