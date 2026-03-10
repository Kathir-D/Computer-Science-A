package CS22526.Labs.Unit11;

public class HistoNode
{
   private Comparable data;
   private int dataCount;
   private HistoNode left;
   private HistoNode right;

   public HistoNode(Comparable d, int cnt, HistoNode lft, HistoNode rt)
   {
      data = d;
      dataCount = cnt;
      left = lft;
      right = rt;
   }

   public Comparable getData()
   {
      return data;
   }

   public int getDataCount()
   {
      return dataCount;
   }

   public HistoNode getLeft()
   {
      return left;
   }

   public HistoNode getRight()
   {
      return right;
   }

   public void setData(Comparable d)
   {
      data = d;
   }

   public void setDataCount(int cnt)
   {
      dataCount = cnt;
   }

   public void setLeft(HistoNode lft)
   {
      left = lft;
   }

   public void setRight(HistoNode rt)
   {
      right = rt;
   }
}
