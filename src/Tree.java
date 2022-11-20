public class Tree
{
    public static class Node
    {
        Node left;
        Node right;
        int value;
        Node rootnode = new Node(25);
        public Node(int value)
        {
            this.value = value;
        }
    }

    public Node root;
    public static boolean flag = false;



    public void add(Node node, int value)
    {
        if (value < node.value)
        {
            if (node.left != null)
            {
                add(node.left, value);
            } else
            {
                System.out.println("  Inserted " + value + " to left of Node " + node.value);
                node.left = new Node(value);
            }
        }
        else if (value > node.value)
        {
            if (node.right != null)
            {
                add(node.right, value);
            } else
            {
                System.out.println("  Inserted " + value + " to right of Node " + node.value);
                node.right = new Node(value);
            }

        }

    }

        public void contains(Node temp, int value)
        {
            //Check whether tree is empty
            if(root == null)
            {
                System.out.println("Tree is empty");
            }
            else
            {
                //If value is found in the given binary tree then, set the flag to true
                if(temp.value == value)
                {
                    flag = true;
                    return;
                }
                //Search in left subtree
                if(flag == false && temp.left != null)
                {
                    contains(temp.left, value);
                }
                //Search in right subtree
                if(flag == false && temp.right != null)
                {
                    contains(temp.right, value);
                }
            }
        }


public int smallestElement(Node temp)
        {
        //Check whether tree is empty
        if(root == null)
        {
        System.out.println("Tree is empty");
        return 0;
        }
        else
        {
        int leftMin, rightMin;
        //Min will store temp's data
        int min = temp.value;
        //It will find smallest element in left subtree
        if(temp.left != null)
        {
        leftMin = smallestElement(temp.left);
        //If min is greater than leftMin then store the value of leftMin into min
        min = Math.min(min, leftMin);
        }
        //It will find smallest element in right subtree
        if(temp.right != null)
        {
        rightMin = smallestElement(temp.right);
        min = Math.min(min, rightMin);
        }
        return min;
        }
        }
    public int largestElement(Node temp)
    {
        if(root == null)
        {
            System.out.println("Tree is empty");
            return 0;
        }
        else
        {
            int leftMax, rightMax;

            int max = temp.value;

            if(temp.left != null){
                leftMax = largestElement(temp.left);
                max = Math.max(max, leftMax);
            }
            if(temp.right != null){
                rightMax = largestElement(temp.right);
                max = Math.max(max, rightMax);
            }
            return max;
        }
    }


}
