package org.eclipse.lsp4j;

import org.eclipse.lsp4j.DidChangeConfigurationCapabilities;
import org.eclipse.lsp4j.DidChangeWatchedFilesCapabilities;
import org.eclipse.lsp4j.ExecuteCommandCapabilities;
import org.eclipse.lsp4j.SymbolCapabilities;
import org.eclipse.lsp4j.WorkspaceEditCapabilities;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Workspace specific client capabilities.
 */
@SuppressWarnings("all")
public class WorkspaceClientCapabilities {
  /**
   * The client supports applying batch edits to the workspace by supporting
   * the request 'workspace/applyEdit'.
   */
  private Boolean applyEdit;
  
  /**
   * Capabilities specific to `WorkspaceEdit`s
   */
  private WorkspaceEditCapabilities workspaceEdit;
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  private DidChangeConfigurationCapabilities didChangeConfiguration;
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  private DidChangeWatchedFilesCapabilities didChangeWatchedFiles;
  
  /**
   * Capabilities specific to the `workspace/symbol` request.
   */
  private SymbolCapabilities symbol;
  
  /**
   * Capabilities specific to the `workspace/executeCommand` request.
   */
  private ExecuteCommandCapabilities executeCommand;
  
  /**
   * The client supports applying batch edits to the workspace by supporting
   * the request 'workspace/applyEdit'.
   */
  @Pure
  public Boolean getApplyEdit() {
    return this.applyEdit;
  }
  
  /**
   * The client supports applying batch edits to the workspace by supporting
   * the request 'workspace/applyEdit'.
   */
  public void setApplyEdit(final Boolean applyEdit) {
    this.applyEdit = applyEdit;
  }
  
  /**
   * Capabilities specific to `WorkspaceEdit`s
   */
  @Pure
  public WorkspaceEditCapabilities getWorkspaceEdit() {
    return this.workspaceEdit;
  }
  
  /**
   * Capabilities specific to `WorkspaceEdit`s
   */
  public void setWorkspaceEdit(final WorkspaceEditCapabilities workspaceEdit) {
    this.workspaceEdit = workspaceEdit;
  }
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  @Pure
  public DidChangeConfigurationCapabilities getDidChangeConfiguration() {
    return this.didChangeConfiguration;
  }
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  public void setDidChangeConfiguration(final DidChangeConfigurationCapabilities didChangeConfiguration) {
    this.didChangeConfiguration = didChangeConfiguration;
  }
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  @Pure
  public DidChangeWatchedFilesCapabilities getDidChangeWatchedFiles() {
    return this.didChangeWatchedFiles;
  }
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  public void setDidChangeWatchedFiles(final DidChangeWatchedFilesCapabilities didChangeWatchedFiles) {
    this.didChangeWatchedFiles = didChangeWatchedFiles;
  }
  
  /**
   * Capabilities specific to the `workspace/symbol` request.
   */
  @Pure
  public SymbolCapabilities getSymbol() {
    return this.symbol;
  }
  
  /**
   * Capabilities specific to the `workspace/symbol` request.
   */
  public void setSymbol(final SymbolCapabilities symbol) {
    this.symbol = symbol;
  }
  
  /**
   * Capabilities specific to the `workspace/executeCommand` request.
   */
  @Pure
  public ExecuteCommandCapabilities getExecuteCommand() {
    return this.executeCommand;
  }
  
  /**
   * Capabilities specific to the `workspace/executeCommand` request.
   */
  public void setExecuteCommand(final ExecuteCommandCapabilities executeCommand) {
    this.executeCommand = executeCommand;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("applyEdit", this.applyEdit);
    b.add("workspaceEdit", this.workspaceEdit);
    b.add("didChangeConfiguration", this.didChangeConfiguration);
    b.add("didChangeWatchedFiles", this.didChangeWatchedFiles);
    b.add("symbol", this.symbol);
    b.add("executeCommand", this.executeCommand);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    WorkspaceClientCapabilities other = (WorkspaceClientCapabilities) obj;
    if (this.applyEdit == null) {
      if (other.applyEdit != null)
        return false;
    } else if (!this.applyEdit.equals(other.applyEdit))
      return false;
    if (this.workspaceEdit == null) {
      if (other.workspaceEdit != null)
        return false;
    } else if (!this.workspaceEdit.equals(other.workspaceEdit))
      return false;
    if (this.didChangeConfiguration == null) {
      if (other.didChangeConfiguration != null)
        return false;
    } else if (!this.didChangeConfiguration.equals(other.didChangeConfiguration))
      return false;
    if (this.didChangeWatchedFiles == null) {
      if (other.didChangeWatchedFiles != null)
        return false;
    } else if (!this.didChangeWatchedFiles.equals(other.didChangeWatchedFiles))
      return false;
    if (this.symbol == null) {
      if (other.symbol != null)
        return false;
    } else if (!this.symbol.equals(other.symbol))
      return false;
    if (this.executeCommand == null) {
      if (other.executeCommand != null)
        return false;
    } else if (!this.executeCommand.equals(other.executeCommand))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.applyEdit== null) ? 0 : this.applyEdit.hashCode());
    result = prime * result + ((this.workspaceEdit== null) ? 0 : this.workspaceEdit.hashCode());
    result = prime * result + ((this.didChangeConfiguration== null) ? 0 : this.didChangeConfiguration.hashCode());
    result = prime * result + ((this.didChangeWatchedFiles== null) ? 0 : this.didChangeWatchedFiles.hashCode());
    result = prime * result + ((this.symbol== null) ? 0 : this.symbol.hashCode());
    result = prime * result + ((this.executeCommand== null) ? 0 : this.executeCommand.hashCode());
    return result;
  }
}
