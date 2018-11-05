package fr.esipe.aho.l3pcontrole1.composite;

import lombok.Builder;

import java.util.HashSet;
import java.util.Set;

/**
 * @Builder
 */
public class ManagerEmployees {

    /**
     * Employees' parameters
     */
    private String name;
    private String category;

    /**
     * Directories
     */
    private boolean folder;
    private Set<ManagerEmployees> files = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isFolder() {
        return folder;
    }

    public void setFolder(boolean folder) {
        this.folder = folder;
    }

    public Set<ManagerEmployees> getFiles() {
        return files;
    }

    public void setFiles(Set<ManagerEmployees> files) {
        this.files = files;
    }


    /**
     *     Display Yvette's employees
     *               public void printEmployees(){
     *               ManagerEmployees e = ManagerEmployees.builder()
     *                       .name("Yvette")
     *                       .category(category.CEO)
     *                       .build();
     *           }
     */



         public static void main (String [] args){

             /**
              * hierarchie
              */

             ManagerEmployees file1 = new ManagerEmployees();
              file1.setName("Jean-Patrick");
              file1.setCategory("Developper");
              file1.setFolder(true);

              ManagerEmployees file2 = new ManagerEmployees();
              file2.setName("Marie-Jeanne");
              file2.setCategory("Marketing");

              ManagerEmployees file3 = new ManagerEmployees();
              file3.setName("Sylvie");
              file3.setCategory("Accountant");

             ManagerEmployees file4 = new ManagerEmployees();
             file4.setName("Jean-Christophe");
             file4.setCategory("Developper");

             ManagerEmployees file5 = new ManagerEmployees();
             file5.setName("Jean-Yves");
             file5.setCategory("Developper");

             ManagerEmployees file6 = new ManagerEmployees();
             file6.setName("Jean-Mouloud");
             file6.setCategory("Developper");

             ManagerEmployees file7 = new ManagerEmployees();
             file7.setName("Marie-Christelle");
             file7.setCategory("Marketing");

             ManagerEmployees file8 = new ManagerEmployees();
             file8.setName("Marie-Claire");
             file8.setCategory("Marketing");


             ManagerEmployees directory1 = new ManagerEmployees();
             directory1.setName("Yvette");
             directory1.setCategory("CEO");
             directory1.getFiles().add(file1);
             directory1.getFiles().add(file2);
             directory1.getFiles().add(file3);
             file1.getFiles().add(file4);
             file1.getFiles().add(file5);
             file1.getFiles().add(file6);
             file2.getFiles().add(file7);
             file2.getFiles().add(file8);

             for(ManagerEmployees f : directory1.getFiles()){
                  System.out.println(f);
              }

             for(ManagerEmployees p : file1.getFiles()){
                 System.out.println(p);
             }

             for(ManagerEmployees s : file2.getFiles()){
                 System.out.println(s);
             }
          }



}
