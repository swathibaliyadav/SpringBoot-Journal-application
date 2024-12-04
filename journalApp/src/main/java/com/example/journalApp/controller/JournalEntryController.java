//package com.example.journalApp.controller;
//
//import com.example.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController {
//    private Map<String, JournalEntry> JournalEntries= new HashMap<>();
//    @GetMapping
//    public List<JournalEntry> getall(){
//        return new ArrayList<>(JournalEntries.values());
//    }
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        JournalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId){
//        return JournalEntries.get(myId);
//    }
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteJournalEntryById(@PathVariable String myId){
//        return JournalEntries.remove(myId);
//    }
//    @PutMapping
//    public JournalEntry updateJournalEntryById(@PathVariable String id, @RequestBody JournalEntry myEntry){
//        return JournalEntries.put(id, myEntry);
//    }
//}
