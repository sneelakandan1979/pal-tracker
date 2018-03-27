package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository {
    Map<Long, TimeEntry> timeEntryMap;

    public InMemoryTimeEntryRepository() {
        timeEntryMap = new HashMap<Long, TimeEntry>();
    }
    public TimeEntry create(TimeEntry timeEntry) {
        Long id = timeEntryMap.size() + 1L;
        TimeEntry newTimeEntry = new TimeEntry(
                id,
                timeEntry.getProjectId(),
                timeEntry.getUserId(),
                timeEntry.getDate(),
                timeEntry.getHours()
        );

        timeEntryMap.put(id, newTimeEntry);
        return newTimeEntry;
    }

    public TimeEntry find(Long id) {
        return timeEntryMap.get(id);
    }

    public List<TimeEntry> list() {
        return new ArrayList<>(timeEntryMap.values());
    }

    public TimeEntry update(Long id, TimeEntry timeEntry) {
        return null;
    }

    public void delete(Long id) {

    }
}
