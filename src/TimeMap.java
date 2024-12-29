import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimeMap {
    static class TimeMapValue {

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        String value;
        int timestamp;

        TimeMapValue(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }

        public String toString() {
            return this.value + "--" + this.timestamp;
        }
    }

    Map<String, List<TimeMapValue>> store;

    public TimeMap() {
        store = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TimeMapValue mapValue = new TimeMapValue(value, timestamp);
        List<TimeMapValue> list = store.getOrDefault(key, new ArrayList<>());
        list.add(mapValue);
        store.put(key, list);
    }

    public String get(String key, int timestamp) {
        if (!store.containsKey(key)) {
            return "";
        }
        List<TimeMapValue> valuesWithTime = store.get(key);
        TimeMapValue found = findClosest(valuesWithTime, timestamp);
        return found == null ? "" : found.getValue();
    }

    private TimeMapValue findClosest(List<TimeMapValue> sortedList, int timestamp) {

        if (timestamp < sortedList.get(0).getTimestamp()) {
            return null;
        }

        if (timestamp > sortedList.get(sortedList.size() - 1).getTimestamp()) {
            return sortedList.get(sortedList.size() - 1);
        }

        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedList.get(mid).getTimestamp() == timestamp)
                return sortedList.get(mid);
            else if (sortedList.get(mid).getTimestamp() > timestamp) {
                right = mid - 1;
                if (sortedList.get(right).getTimestamp() < timestamp)
                    return sortedList.get(right);
            } else {
                left = mid + 1;
                if (sortedList.get(left).getTimestamp() > timestamp)
                    return sortedList.get(left - 1);
            }
        }

        return null;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */