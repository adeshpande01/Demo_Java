package Tmobile.com.Demo_project;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

     RecordsRepository recordsRepository;

    public RecordService(RecordsRepository recordsRepository) {
        this.recordsRepository = recordsRepository;
    }

   public ReturnData addRecord(ReturnData record) {
        return recordsRepository.save(record);

    }
    public  List<ReturnData> getAllData() {
        return recordsRepository.findAll();
    }
}
