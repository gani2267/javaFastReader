static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        public List<Integer> nextList() throws IOException {
            return Stream.of(br.readLine().replaceAll("\\s+$","").split(" "))
                    .map(Integer::parseInt).collect(toList());
        }

        public int[] nextArr()throws IOException{
            List<Integer> list = Stream.of(br.readLine().replaceAll("\\s+$","").split(" "))
                    .map(Integer::parseInt).collect(toList());
            return list.stream().mapToInt(Integer::intValue).toArray();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
