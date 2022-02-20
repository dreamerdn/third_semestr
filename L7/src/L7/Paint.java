package L7;
public class Paint implements Comparable<Paint> {
        private String paint;
        private String artist;
        private String year;
        private String color;
        private String size;

        public Paint(String paint, String artist, String year, String color, String size) throws DataExeption {
            if (color.isEmpty() || !(paint.matches("^\\D+$")))
                throw new DataExeption("Информация о картине введена некорректно");
            this.paint = paint;

            if (artist.isEmpty()) throw new DataExeption("Информация о худож введена некорректно");
            this.artist = artist;

            if (!(year.matches("[+]?\\d+"))) throw new DataExeption("Информация о годе введена некорректно");
            this.year = year;

            if (color.isEmpty() || !(color.matches("^\\D+$")))
                throw new DataExeption("Информация о цвете введена некорректно");
            this.color = color;

            if (!(size.matches("[+]?\\w+"))) throw new DataExeption(" Размер введен некорректно");
            this.size = size;
        }

        public String getPaint() {
            return paint;
        }

        public String getArtist() {
            return artist;
        }

        public String getYear() {
            return year;
        }

        public String getColor() {
            return color;
        }

        public String getSize() {
            return size;
        }

        public void setPaint(String paint) {
            this.paint = paint;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setSize(String size) {
            this.size = size;
        }

        @Override
        public int compareTo(Paint o) {
            return getPaint().compareTo(o.getPaint());}}
